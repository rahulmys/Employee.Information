package DisplayController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Display {

    @RequestMapping("/employeeinfo")
    public List<info> displayall(){
        return Arrays.asList(
                new info("101","Rahul M","50000"),
                new info("501","Sunil Kumar","45000"),
                new info("801","Pune-eth","85000")
        );
    }
}





