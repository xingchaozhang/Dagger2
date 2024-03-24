package com.example.use_custom_dagger2.apt_create_dagger2;

import com.example.custom_dagger2.MembersInjector;
import com.example.custom_dagger2.Preconditions;
import com.example.custom_dagger2.Provider;
import com.example.use_custom_dagger2.MainActivity;
import com.example.use_custom_dagger2.Student;
import com.example.use_custom_dagger2.StudentComponent;
import com.example.use_custom_dagger2.StudentModule;

// TODO 模拟 这个是编译期 APT 自动生成的  // 第三个注解
public class DaggerStudentComponent implements StudentComponent {

    public DaggerStudentComponent(Builder builder) {
        // 这里面没有代码生成，是靠我们的第四个注解Inject
        initialize(builder);
    }

    // 第四个注解生成的代码
    private Provider<Student> providerDogProvider;
    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private void initialize(final Builder builder) {
        this.providerDogProvider = StudentModule_ProviderStudentFactory.create(builder.studentModule);
        this.mainActivityMembersInjector = MainActivity_MembersInjector.create(providerDogProvider);
    }


    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        // 定义我们的包裹  是靠我们的第四个注解
        StudentModule studentModule;

        private Builder() {}

        public StudentComponent build() {
            if (studentModule == null) {
                studentModule = new StudentModule();
            }

            return new DaggerStudentComponent(this);
        }

        /**
         * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
         */
        @Deprecated
        public Builder studentModule(StudentModule dogModule) {
            Preconditions.checkNotNull(dogModule);
            return this;
        }
    }

    // 对外提供Builder
    public static StudentComponent create() {
        return builder().build();
    }

    // 第四个注解生成的
    // 往目标（MainActivity）中去注入
    @Override // MainActivity this
    public void inject(MainActivity mainActivity) {
        // 启动 MainActivity_MembersInjector 完成依赖注入
        mainActivityMembersInjector.injectMembers(mainActivity);
    }
}
