Original App Design Project 
===

# GoldStorage

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
GoldStorage is a money budget app that helps the user keep track of their, daily, weekly, monthly, 
or yearly budget. Users will be able to set a total budget for their set amount of time
and any inputted spending will notify the user how much budget they have left.  

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Lifestyle/Budgeting
- **Mobile:** This app keeps track of  the user's budget and can modify it in real-time when money is spent.
- **Story:** Allows users to keep track of their avialable budget for spending
- **Market:** Anyone who needs help keeping track of their money can use this app. Ability to overview money is very useful to people with limited income such as college students.
- **Habit:** This app doesn't seem to have addictive features, but it is habit forming since users will edit their total budget after they spend money.
- **Scope:** There is a lot of potential for further work and functionality beyond just money budgeting, but the current idea and required stories are still quite valuable.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User is able to log in/register 
* User is able to see spending in day, week, and month
* User can see total amount of budget available
* User is able to input the amount spent that day, week, or month


**Optional Nice-to-have Stories**

* [fill in your required user stories here]
* User can view description of spending
* Offering Tips on how to save money
* Categorize Spending Habits
* Graph of overall progress

### 2. Screen Archetypes

* Login
    * User is able to log in
* Register
    * User is able to register
* Detail/Home
    * User is able to see spending in day, week, and month
    * User can see total amount of budget available
* Settings
    * User is able to input the amount spent that day, week, or month
* Stream/Spending History
    * User can view description of spending
    * Categorize Spending Habits

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home
* Budget Settings
* Spending History

**Flow Navigation** (Screen to Screen)

* Login
    * Detail/Home
* Register
    * Budget Settings
* Detail/Home
    * Budget Settings
    * Spending History
* Settings
    * Detail/Home
    * Spending History
* Stream/Spending History
    * Detail/Home
    * Spending History

## Wireframes
<img src="YOUR_WIREFRAME_IMAGE_URL.png" width=600>

## Schema 
### Models
### SpendingObject
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user budget log |
   | description   | String   | description of spending |
   | spending      | Number   | how much was spent |
   | createdAt     | DateTime | date when spending is created (default field) |
   | updatedAt     | DateTime | date when spending is last updated (default field) |
### Networking
#### List of network requests by screen
   - Spending History Screen
      - (Read/GET) Query all spendings where user is author
      - (Update/POST) update description of spending
      - (Delete) Delete existing spending
   - Create Spending Screen
      - (Create/POST) Create a new spending object
   - Log In Screen
      - (Read/GET) Query logged in user object
      - (Create/PUT) Create user profile
