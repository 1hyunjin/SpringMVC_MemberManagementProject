package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //return "ok" 에서 ok를 messagebody로 화면에 출력시킴
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); //getClass() = LogTestController.class

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";
        System.out.println("name = " + name);   // 이제는 이렇게 쓰면 안된다

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }

}
