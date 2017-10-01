Feature: Locate stores functionality
  @debug
  Scenario: 1.select state and location
  Given as not valid user
  When browse to URL "http://www.wholefoods.com"
  Then wholefood page appear.
  When click on "coupon" link
  Then Store page appear
  When select store "New York"
  And select Lacation "Jericho"
  And click "sales and coupon" link
  Then "Jericho" apprar at the top.