Feature: Automation Testing Website Demoblaze

  @register-user
  Scenario: Test can do with register unregistered data user
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user input sign up username unregistered
    And user input sign up password unregistered
    And user click sign up button
    Then verify display alert message "Sign up successful."

  @register-user
  Scenario: Test can't do register without input username
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user input sign up password unregistered
    And user click sign up button
    Then verify display alert message "Please fill out Username and Password."

  @register-user
  Scenario: Test can't do register without input password
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user input sign up username unregistered
    And user click sign up button
    Then verify display alert message "Please fill out Username and Password."


  @register-user
  Scenario: User can't do register without input username and password
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user click sign up button
    Then verify display alert message "Please fill out Username and Password."

  @register-user
  Scenario: User can't do register with already username and password data
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user input sign up username "joni"
    And user input sign up password "joni123"
    And user click sign up button
    Then verify display alert message "This user already exist."

  @register-user
  Scenario: User test button close in sign up pop-up
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user click close register button
    Then verify the sign up pop-up is not displayed

  @register-user
  Scenario: User test close in sign up pop-up using X button
    Given user is on web home page
    And user click menu sign up
    And showing verify pop-up sign up user
    When user click X register button
    Then verify the sign up pop-up is not displayed

  @login-user
  Scenario: User test login with username and password registered
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user input log in username "fachri"
    And user input log in password "fachri12345"
    And user click log in button
    Then validation user has been logged in "Welcome fachri"

  @login-user
  Scenario: Test user can't do login without input username
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user input log in username "joni"
    And user click log in button
    Then verify display alert message "Please fill out Username and Password."

  @login-user
  Scenario: Test user can't do login without input password
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user input log in password "joni123"
    And user click log in button
    Then verify display alert message "Please fill out Username and Password."

  @login-user
  Scenario: Test user can't do login because the password is wrong
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user input log in username "fachri"
    And user input log in password "password_salah"
    And user click log in button
    Then verify display alert message "Wrong password."

  @login-user
  Scenario: User test button close in log in pop-up
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user click close login button
    Then verify the log in pop-up is not displayed

  @login-user
  Scenario: User test close in log in pop-up using X button
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user click X login button
    Then verify the log in pop-up is not displayed

  @contact-menu
  Scenario: User test can send message on the contact pop-up
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact email "fachri@gmail.com"
    And input contact name "fachri"
    And input message "Hallo, Welcome My Course"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up without input name
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact email "fachri@gmail.com"
    And input message "Hallo, Welcome My Course"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up without message
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact email "fachri@gmail.com"
    And input contact name "fachri"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up without message
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact email "fachri@gmail.com"
    And input contact name "fachri"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up with input contact email only
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact email "fachri@gmail.com"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up with input contact name only
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input contact name "fachri"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up with input message only
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    And input message "Hallo, Welcome My Course"
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test can send message on the contact pop-up without input email, name and message
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    When user click send message button
    Then verify user has been send message "Thanks for the message!!"

  @contact-menu
  Scenario: User test button close in menu contact pop-up
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    When user click close contact button
    Then verify the new message pop-up is not displayed

  @contact-menu
  Scenario: User test close in menu contact pop-up using X button
    Given user is on web home page
    And user click menu contact
    And showing verify pop-up new message
    When user click X contact button
    Then verify the new message pop-up is not displayed

  @about-us-menu
  Scenario: Test user can not play video on the about us pop-up
    Given user is on web home page
    And user click menu about us
    And showing verify pop-up about us
    When user can not button play in video
    And user click close about us button
    Then verify the menu about us pop-up is not displayed

  @about-us-menu
  Scenario: User test button close in menu about us pop-up
    Given user is on web home page
    And user click menu about us
    And showing verify pop-up about us
    When user click close about us button
    Then verify the menu about us pop-up is not displayed

  @about-us-menu
  Scenario: User test close in menu about us pop-up using X button
    Given user is on web home page
    And user click menu about us
    And showing verify pop-up about us
    When user click X about us button
    Then verify the menu about us pop-up is not displayed


  @cart-menu-category
  Scenario: User test click phone category
    Given user is on web home page
    When user click phone category
    Then user can see one of the products "Nokia lumia 1520"

  @cart-menu-category
  Scenario: User test click laptops category
    Given user is on web home page
    When user click laptops category
    Then user can see one of the products "MacBook Pro"

  @cart-menu-category
  Scenario: User test click monitors category
    Given user is on web home page
    When user click monitors category
    Then user can see one of the products "ASUS Full HD"

  @cart-menu-transaction
  Scenario: User test can add item product to cart
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    Then verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price

  @cart-menu-transaction
  Scenario: User test can add more than one item to cart
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user back to home page
    And user click laptops category
    And user click product "Sony vaio i5"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    Then verify product already added the cart page "Nokia lumia 1520, Sony vaio i5"
    And verify user can see total price

  @cart-menu-transaction
  Scenario: User test delete item product from cart
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And user click button delete for "Nokia lumia 1520"
    Then product successfully deleted from cart

  @cart-menu-transaction
  Scenario: User test delete item product from cart
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user back to home page
    And user click laptops category
    And user click product "Sony vaio i5"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    Then verify product already added the cart page "Nokia lumia 1520, Sony vaio i5"
    And user click button delete for "Nokia lumia 1520"
    And user click button delete for "Sony vaio i5"
    Then product successfully deleted from cart

  @cart-menu-transaction
  Scenario: User test can do checkout the item
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input name "fachri"
    And user input country "indonesia"
    And user input city "jakarta"
    And user input credit card "5555555555554444"
    And user input month "02"
    And user input year "2027"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @cart-menu-transaction
  Scenario: User test can do checkout without item product in cart
    Given user is on web home page
    And user go to menu cart
    When user click button place order
    And showing verify order from pop-up displayed
    And user input name "fachri"
    And user input country "indonesia"
    And user input city "jakarta"
    And user input credit card "5555555555554444"
    And user input month "02"
    And user input year "2027"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @cart-menu-transaction
  Scenario: User test can't do checkout item product without input data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input name only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input name "fachri"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input country only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input country "indonesia"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input city only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input city "jakarta"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input credit card only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input credit card "5555555555554444"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input month only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input month "02"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input year only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input year "2027"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @cart-menu-transaction
  Scenario: User test can't do checkout item product with input name and credit card only data place order
    Given user is on web home page
    When user click phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to menu cart
    And verify product already added the cart page "Nokia lumia 1520"
    And verify user can see total price
    And user click button place order
    And showing verify order from pop-up displayed
    And user input name "fachri"
    And user input credit card "5555555555554444"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @cart-menu-transaction
  Scenario: User test button close in place order pop-up
    Given user is on web home page
    And user click menu cart
    And user click place order button
    And showing verify pop-up form place order
    When user click close cart button
    Then verify form place order pop-up is not displayed

  @cart-menu-transaction
  Scenario: User test close in place order pop-up using X button
    Given user is on web home page
    And user click menu cart
    And user click place order button
    And showing verify pop-up form place order
    When user click X cart button
    Then verify form place order pop-up is not displayed

  @logout-user
  Scenario: Test user can logout after do login
    Given user is on web home page
    And user click menu log in
    And showing verify pop-up log in user
    When user input log in username "fachri"
    And user input log in password "fachri12345"
    And user click log in button
    And validation user has been logged in "Welcome fachri"
    And user click menu log out
    Then user successfully logged out









