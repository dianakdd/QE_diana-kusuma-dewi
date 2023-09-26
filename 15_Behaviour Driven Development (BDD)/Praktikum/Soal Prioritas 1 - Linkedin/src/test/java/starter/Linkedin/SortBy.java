package starter.Linkedin;

import net.thucydides.core.annotations.Step;

public class SortBy {
    @Step("I click the Sort area feature")
    public void ClickTheSortAreaFeature() {
        System.out.println("I click the Sort area feature");
    }
    @Step("I select the sort type")
    public void SelectTheSortType() {
        System.out.println("I select the sort type");
    }
    @Step("I choose sorted by newest")
    public void ChooseSortedByNewest() {
        System.out.println("I choose sorted by newest");
    }
    @Step("I redirect to the top of newest post")
    public void RedirectToTheTopOfNewestPost() {
        System.out.println("I redirect to the top of newest post");
    }
    @Step("I choose sorted by most popular")
    public void ChooseSortedByMostPopular() {
        System.out.println("I choose sorted by most popular");
    }
    @Step("I redirect to the top of most popular post")
    public void RedirectToTheTopOfMostPopularPost() {
        System.out.println("I redirect to the top of most popular post");
    }
}
