package cucumberStepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import delfiRecipeTest.Pages.*;

public class checkRecipeDelfiStepDefs {
    BaseFunc baseFunc = new BaseFunc();
    HomePage homePage = new HomePage(baseFunc);
    FoodPage foodPage = new FoodPage(baseFunc);
    RecipePage recipePage = new RecipePage(baseFunc);
    IngredientPage ingredientPage = new IngredientPage(baseFunc);

    private final String HOME_PAGE = "https://rus.delfi.lv/";

    @Given("RUS Delfi home page")
    public void open_home_page(){
        baseFunc.openPage(HOME_PAGE);
    }

    @When("we submit cookies")
    public void submit_cookies(){
        homePage.isCookiePresent();
    }

    @Then("we are clicking on Food section")
    public void click_on_food_section(){
        homePage.clickOnFood();
    }

    @Then("waiting for page load")
    public void wait_for_load(){
        baseFunc.waitLoad();
    }

    @Then("selecting recipe by id (.*)")
    public void select_recipe(){
        foodPage.clickOnRecipe(1);
    }

    @Then("getting recipe name")
    public void get_recipe_name(){
        recipePage.getRecipeText();
    }

    @Then("checking for ingredients")
    public void check_for_ingredienst(){
        recipePage.checkIngredients();
    }

    @Then("clicking on first ingredient")
    public void click_on_first_ingredient(){
        recipePage.clickOnIngredient(0);
    }

    @Then("checking for selected recipe name")
    public void check_for_recipe(){
        ingredientPage.checkForSelectedRecipeName(recipePage.getRecipeText());
    }
}
