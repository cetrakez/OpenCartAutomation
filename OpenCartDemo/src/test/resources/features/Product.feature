Feature: Product Page
  As a user, I view product details, add to cart, write review, & check availability

  @product @productdetails
  Scenario: View Product Details
    Given I am on the Home Page
    When I navigate to a product page
    Then I should see the product name
    And I should see the product price
    And I should see the product description
    And I should see the product images

  @product @addToCart
  Scenario: Add Product to Cart
    Given I am on a product page
    When I click on Add to Cart button
    Then I should see a confirmation message
    And  the product should be added to the cart

  @product @addReview
  Scenario: Write a Product Review
    Given I am on a product page
    When I click on Write a Review link
    And I enter my name and my review
    And I rate the product with a good rating
    And I click on Continue button
    Then I should see a review submission confirmation message
