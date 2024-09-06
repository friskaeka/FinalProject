Feature: Test Automation Web

  @web
  Scenario: Test sign up with blank username and password
    Given open web homepage
    And user click sign up
    And user see modal sign up
    And user click button sign up
    And user will see error massage "Please fill out Username and Password."
    And user click oke in modal
    And user see modal sign up

  @web
  Scenario: Test sign up with blank password
    Given open web homepage
    And user click sign up
    And user see modal sign up
    And user field username "kennan"
    And user click button sign up
    And user will see error massage "Please fill out Username and Password."
    And user click oke in modal
    And user see modal sign up

  @web
  Scenario: Test sign up with blank username
    Given open web homepage
    And user click sign up
    And user see modal sign up
    And user field password "friska10"
    And user click button sign up
    And user will see error massage "Please fill out Username and Password."
    And user click oke in modal
    And user see modal sign up

  @web
  Scenario: Test sign up and user click cancel
    Given open web homepage
    And user click sign up
    And user see modal sign up
    And user click button cancel sign up
    And user see homepage

  @web
  Scenario: Test sign up
    Given open web homepage
    And user click sign up
    And user see modal sign up
    And user field username with generator username
    And user field password with generator password
    And user click button sign up
    And user will see homepage welcome
#    And user will see massage "Sign up successful."
#    And user click oke in modal

  @web
  Scenario: Test login with blank username and password
    Given open web homepage
    And user click login
    And user see modal login
    And user click button login
    And user will see error massage "Please fill out Username and Password."

  @web
  Scenario: Test login with blank username
    Given open web homepage
    And user click login
    And user see modal login
    And user field password login "friska1051"
    And user click button login
    And user will see error massage "Please fill out Username and Password."

  @web
  Scenario: Test login with blank password
    Given open web homepage
    And user click login
    And user see modal login
    And user field username login "kennankenny"
    And user click button login
    And user will see error massage "Please fill out Username and Password."

  @web
  Scenario: Test login and user click cancel
    Given open web homepage
    And user click login
    And user see modal login
    And user click button cancel
    And user see homepage

  @web
  Scenario: Test login
    Given open web homepage
    And user click login
    And user see modal login
    And user field username login "kennankenny"
    And user field password login "friska1051"
    And user click button login
    And user will see homepage welcome

    @web
    Scenario: User click categories
      Given open web homepage
      And user click phone categories
      And user see phone
      And user click laptops categories
      And user see laptop
      And User click monitor categories
      And user see monitor

  @web
  Scenario: User see detail product
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product

  @web
  Scenario: User add to cart
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart

  @web
  Scenario: User see cart page
    Given open web homepage
    And user click chart
    And user see cart page

  @web
  Scenario: User add to cart and see cart page
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart
    And user click chart
    And user see cart page

  @web
  Scenario: User delet cart
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart
    And user click chart
    And user see cart page
    And user delet item

  @web
  Scenario: User order item
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart
    And user click chart
    And user see cart page
    And user click place order
    And user see modal form

  @web
  Scenario: User not field form
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart
    And user click chart
    And user see cart page
    And user click place order
    And user see modal form
    And user click purchase
    And user will see error massage "Please fill out Name and Creditcard."

  @web
  Scenario: User field form cart
    Given open web homepage
    And user click phone categories
    And user see phone
    And user click product
    And user see detail product
    And user click add to cart
    And user click chart
    And user see cart page
    And user click place order
    And user see modal form
    And user fill name field with "friska"
    And user fill country field with "indonesia"
    And user fill city field with "jakarta"
    And user fill credit card field with "000"
    And user fill month field with "02"
    And user fill year field with "2020"
    And user click purchase









