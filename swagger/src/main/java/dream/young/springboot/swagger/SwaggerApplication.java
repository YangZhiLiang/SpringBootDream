package dream.young.springboot.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Desc:
 * Mail: yangzl@terminus.io
 * author: DreamYoung
 * Date: 2016/10/12
 */
@SpringBootApplication
public class SwaggerApplication {

    private static final String BANNER = "  _____                            __     __                     \n" +
            " |  __ \\                           \\ \\   / /                     \n" +
            " | |  | |_ __ ___  __ _ _ __ ___    \\ \\_/ /__  _   _ _ __   __ _ \n" +
            " | |  | | '__/ _ \\/ _` | '_ ` _ \\    \\   / _ \\| | | | '_ \\ / _` |\n" +
            " | |__| | | |  __/ (_| | | | | | |    | | (_) | |_| | | | | (_| |\n" +
            " |_____/|_|  \\___|\\__,_|_| |_| |_|    |_|\\___/ \\__,_|_| |_|\\__, |\n" +
            "                                                            __/ |\n" +
            "                                                           |___/ \n";

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SwaggerApplication.class);
        application.setBanner((environment, aClass, printStream) -> printStream.print(BANNER));
        application.run(args);
    }
}
