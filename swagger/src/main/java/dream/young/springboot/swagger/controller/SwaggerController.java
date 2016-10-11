package dream.young.springboot.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Mail: yangzl@terminus.io
 * author: DreamYoung
 * Date: 2016/10/11
 */
@Api(tags = "test swagger")
@RestController
@RequestMapping("/api/dream/swagger")
public class SwaggerController {

    @ApiOperation(value = "say hello", response = String.class)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, World";
    }

}
