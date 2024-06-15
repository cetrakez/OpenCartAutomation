Feature: Product Page
  As a user, I view product details, add to cart, write review, & check availability

  @productdetails
  Scenario: View Product Details
    Given I am on the Home Page
    When I navigate to a product page
    Then I should see the product name
    And I should see the product price
    And I should see the product description
    And I should see the product images

  Scenario: Add Product to Cart
    Given I am on a product page
    When I click on "Add to Cart" button
    Then the product should be added to the cart
    And I should see a confirmation message

  Scenario: Write a Product Review
    Given I am on a product page
    When I click on "Write a Review" link
    And I enter a review title and review description
    And I rate the product with 5 stars
    And I click on "Submit Review" button
    Then I should see a review submission confirmation message

  Scenario: Check Product Availability
    Given I am on a product page
    When I select a product option (if applicable)
    Then I should see the product availability status