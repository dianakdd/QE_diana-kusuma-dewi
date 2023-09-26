package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Linkedin.CreatePost;
import starter.Linkedin.ReactionPost;
import starter.Linkedin.ScrollUp;
import starter.Linkedin.SortBy;


public class AllSteps {

    @Steps
    CreatePost createpost;
    @Steps
    ReactionPost reactionpost;
    @Steps
    ScrollUp scrollup;
    @Steps
    SortBy sortby;

    //createpost

    @Given("I am on the LinkedIn homepage")
    public void iAmOnTheLinkedInHomepage() {
        createpost.OnTheLinkedInHomepage();
    }

    @When("I click the Create Post button")
    public void iClickTheCreatePostButton() {
        createpost.ClickTheCreatePostButton();
    }

    @And("I select Text as the post type")
    public void iSelectTextAsThePostType() {
        createpost.SelectTextAsThePostType();
    }

    @And("I enter the text Hello, LinkedIn! in the post content")
    public void iEnterTheTextHelloLinkedInInThePostContent() {
        createpost.EnterTheText();
    }

    @And("I click the Post button")
    public void iClickThePostButton() {
        createpost.ClickThePostButton();
    }

    @And("I click the confirmation button to publish it")
    public void iClickTheConfirmationButtonToPublishIt() {
        createpost.TheConfirmationButtonToPublishIt();
    }

    @Then("I redirect to the post of published text post")
    public void iRedirectToThePostOfPublishedTextPost() {
        createpost.RedirectToThePostOfPublishedTextPost();
    }

    @And("I select Photo as the post type")
    public void iSelectPhotoAsThePostType() {
        createpost.SelectPhotoAsThePostType();
    }

    @And("I attach a photo to the post")
    public void iAttachAPhotoToThePost() {
        createpost.AttachAPhotoToThePost();
    }

    @And("I add captions to the photo post")
    public void iAddCaptionsToThePhotoPost() {
        createpost.AddCaptionsToThePhotoPost();
    }

    @Then("I redirect to the post of published photo post")
    public void iRedirectToThePostOfPublishedPhotoPost() {
        createpost.RedirectToThePostOfPublishedPhotoPost();
    }

    @And("I select Video as the post type")
    public void iSelectVideoAsThePostType() {
        createpost.SelectVideoAsThePostType();
    }

    @And("I upload a video file")
    public void iUploadAVideoFile() {
        createpost.UploadAVideoFile();
    }

    @And("I add captions to the video post")
    public void iAddCaptionsToTheVideoPost() {
        createpost.AddCaptionsToTheVideoPost();
    }

    @Then("I redirect to the post of published video post")
    public void iRedirectToThePostOfPublishedVideoPost() {
        createpost.RedirectToThePostOfPublishedVideoPost();
    }

    @And("I select Article as the post type")
    public void iSelectArticleAsThePostType() {
        createpost.SelectArticleAsThePostType();
    }

    @And("I enter the article title")
    public void iEnterTheArticleTitle() {
        createpost.EnterTheArticleTitle();
    }

    @And("I write the article content")
    public void iWriteTheArticleContent() {
        createpost.WriteTheArticleContent();
    }

    @And("I click the next button within the article editor")
    public void iClickTheNextButtonWithinTheArticleEditor() {
        createpost.ClickTheNextButtonWithinTheArticleEditor();
    }

    @Then("I redirect to the post of published article post")
    public void iRedirectToThePostOfPublishedArticlePost() {
        createpost.RedirectToThePostOfPublishedArticlePost();
    }

    @When("I click the Create program button")
    public void iClickTheCreateProgramButton() {
        createpost.ClickTheCreateProgramButton();
    }

    @And("I select the program type")
    public void iSelectTheProgramType() {
        createpost.SelectTheProgramType();
    }

    @And("I select the program format")
    public void iSelectTheProgramFormat() {
        createpost.SelectTheProgramFormat();
    }

    @And("I write the program title")
    public void iWriteTheProgramTitle() {
        createpost.WriteTheProgramTitle();
    }

    @And("I select the program zone")
    public void iSelectTheProgramZone() {
        createpost.SelectTheProgramZone();
    }

    @And("I choose the program started date")
    public void iChooseTheProgramStartedDate() {
        createpost.ChooseTheProgramStartedDate();
    }

    @And("I choose the program started time")
    public void iChooseTheProgramStartedTime() {
        createpost.ChooseTheProgramStartedTime();
    }

    @And("I click checkbox for add ended date and time")
    public void iClickCheckboxForAddEndedDateAndTime() {
        createpost.ClickCheckboxForAddEndedDateAndTime();
    }

    @And("I choose the program ended date")
    public void iChooseTheProgramEndedDate() {
        createpost.ChooseTheProgramEndedDate();
    }

    @And("I choose the program ended time")
    public void iChooseTheProgramEndedTime() {
        createpost.ChooseTheProgramEndedTime();
    }

    @And("I write the description program")
    public void iWriteTheDescriptionProgram() {
        createpost.WriteTheDescriptionProgram();
    }

    @And("I tag a spokesman")
    public void iTagASpokesman() {
        createpost.TagASpokesman();
    }

    @And("I click the next button")
    public void iClickTheNextButton() {
        createpost.ClickTheNextButton();
    }

    @Then("I redirect to the post of published program post")
    public void iRedirectToThePostOfPublishedProgramPost() {
        createpost.RedirectToThePostOfPublishedProgramPost();
    }

    //reactionpost

    @When("I see the post that i like")
    public void iSeeThePostThatILike() {
        reactionpost.SeeThePostThatILike();
    }

    @And("I click icon like in that posts")
    public void iClickIconLikeInThatPosts() {
        reactionpost.ClickIconLikeInThatPosts();
    }

    @Then("the posts successfully liked")
    public void thePostsSuccessfullyLiked() {
        reactionpost.PostsSuccessfullyLiked();
    }

    @When("I see the post that i want to add a comment")
    public void iSeeThePostThatIWantToAddAComment() {
        reactionpost.SeeThePostThatIWantToAddAComment();
    }

    @And("I click icon comment in that posts")
    public void iClickIconCommentInThatPosts() {
        reactionpost.ClickIconCommentInThatPosts();
    }

    @And("I write the comment")
    public void iWriteTheComment() {
        reactionpost.WriteTheComment();
    }

    @And("I click button post")
    public void iClickButtonPost() {
        reactionpost.ClickButtonPost();
    }

    @Then("the comment has been added successfully")
    public void theCommentHasBeenAddedSuccessfully() {
        reactionpost.CommentHasBeenAddedSuccessfully();
    }

    @When("I see the post that i want to repost it")
    public void iSeeThePostThatIWantToRepostIt() {
        reactionpost.ThePostThatIWantToRepostIt();
    }

    @And("I click icon repost in that posts")
    public void iClickIconRepostInThatPosts() {
        reactionpost.ClickIconRepostInThatPosts();
    }

    @And("I select repost with my thought")
    public void iSelectRepostWithMyThought() {
        reactionpost.SelectRepostWithMyThought();
    }

    @And("I write I Agree about this one")
    public void iWriteIAgreeAboutThisOne() {
        reactionpost.WriteIAgreeAboutThisOne();
    }

    @Then("the repost post has been reposted")
    public void theRepostPostHasBeenReposted() {
        reactionpost.RepostPostHasBeenReposted();
    }

    @And("I select repost with instant")
    public void iSelectRepostWithInstant() {
        reactionpost.SelectRepostWithInstant();
    }

    @Then("the repost post has been reposted successfully")
    public void theRepostPostHasBeenRepostedSuccessfully() {
        reactionpost.RepostPostHasBeenRepostedSuccessfully();
    }

    //scrollup

    @When("I see the button new post")
    public void iSeeTheButtonNewPost() {
        scrollup.SeeTheButtonNewPost();
    }

    @And("I click the button new post")
    public void iClickTheButtonNewPost() {
        scrollup.ClickTheButtonNewPost();
    }

    @Then("I redirect to the newest post")
    public void iRedirectToTheNewestPost() {
        scrollup.RedirectToTheNewestPost();
    }

    //sortby
    @When("I click the Sort area feature")
    public void iClickTheSortAreaFeature() {
        sortby.ClickTheSortAreaFeature();
    }

    @And("I select the sort type")
    public void iSelectTheSortType() {
        sortby.SelectTheSortType();
    }

    @And("I choose sorted by newest")
    public void iChooseSortedByNewest() {
        sortby.ChooseSortedByNewest();
    }

    @Then("I redirect to the top of newest post")
    public void iRedirectToTheTopOfNewestPost() {
        sortby.RedirectToTheTopOfNewestPost();
    }

    @And("I choose sorted by most popular")
    public void iChooseSortedByMostPopular() {
        sortby.ChooseSortedByMostPopular();
    }

    @Then("I redirect to the top of most popular post")
    public void iRedirectToTheTopOfMostPopularPost() {
        sortby.RedirectToTheTopOfMostPopularPost();
    }
}