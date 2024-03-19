package in.techcamp.issueapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class IssueController {
    @GetMapping("/issueForm")
    public String ShowIssueForm(@ModelAttribute("issueForm") IssueForm form){
        return  "issueForm";
    }

}
