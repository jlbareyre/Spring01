package com.wildcodeschool.myProject.Controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "William Hartnell <br/>\n <a href=\"javascript:history.back()\">Go Back</a>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String index10() {
        return "David Tennant <br/>\n <a href=\"javascript:history.back()\">Go Back</a>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String index13() {
        return "Jodie Whittaker <br/>\n <a href=\"javascript:history.back()\">Go Back</a>";
    }

}