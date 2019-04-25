package sample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by samir on 4/16/2019.
 */
@RestController
@CrossOrigin
public class Hello {

    @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(){
//        return "{\"id\":\"123\",\"title\":\"ajaxlogin\"}";
        return "hello";
    }

    @RequestMapping(value = "/save")
    public String save(@RequestBody String userData){
        System.out.println("Data received from ui:::"+userData);
        return "saved";
    }
}
