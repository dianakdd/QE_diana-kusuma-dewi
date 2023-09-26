package starter.Linkedin;

import net.thucydides.core.annotations.Step;

public class ScrollUp {
    @Step("I see the button new post")
    public void SeeTheButtonNewPost() {
        System.out.println("I see the button new post");
    }
    @Step("I click the button new post")
    public void ClickTheButtonNewPost() {
        System.out.println("I click the button new post");
    }
    @Step("I redirect to the newest post")
    public void RedirectToTheNewestPost() {
        System.out.println("I redirect to the newest post");
    }
}
