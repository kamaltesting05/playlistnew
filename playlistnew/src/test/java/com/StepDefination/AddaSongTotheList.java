package com.StepDefination;

import static org.junit.Assert.assertTrue;

import com.mashape.unirest.http.Unirest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddaSongTotheList {

	@cucumber.api.java.Before
    public void setUp() {

    }

    @cucumber.api.java.After
    public void tearDown() {

    }

    @Given("^my play list is empty$")
    public void myPlayListIsEmpty() throws Throwable {
        assertTrue(Unirest.get("http://turing.niallbunting.com:3008/api/video")
                .header("Content-Type", "application/json")
                .asJson().getBody().count() == 0);
    }

    @When("^I add one new song to the play list$")
    public void iAddNewSongToThePlayList() throws Throwable {
        assertTrue(Unirest.post("http://turing.niallbunting.com:3008/api/video")
               .header("Content-Type", "application/json")
               .body("{ \"artist\": \"Lady Gaga\", \"song\": \"Poker face\", \"publishDate\": \"2017-09-01\" }")
               .asJson().getStatus() == 200);
    }

    @Then("^my playlist should contain one song$")
    public void myPlaylistShouldContainSong() throws Throwable {
        assertTrue(Unirest.get("http://turing.niallbunting.com:3008/api/video")
                .header("Content-Type", "application/json")
                .asJson().getBody().count() == 1);
    }
}