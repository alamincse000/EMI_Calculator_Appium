# EMI_Calculator_Appium
An EMI calculator testing with appium 

# Tools and Framework used:

Selenium

TestNG

Appium

Allure Reporting

# What I did?:

Open the EMI calculator app

Navigate to the EMI calculator screen

Input necessary fields

Click on calculate button

Verify data from dataset

# How to run:

## Prerequisites:

JDK 8 or higher

Configure GRADLE_HOME and set allure path

Start Appium server

## Steps to run:

clone the repo

give this command in root directory 

```
gradle clean test

```

To generate report hit this command

```
allure generate allure-results --clean -o allure-report

```
```
allure serve allure-results

```

# Report:
![Emi-Report-1](https://user-images.githubusercontent.com/76903243/205505992-7411f1e5-e126-478d-9d9b-88cca3f334da.PNG)
![emi-report2](https://user-images.githubusercontent.com/76903243/205506006-22b448af-f4a0-4e8e-a732-bd3751f86c83.PNG)

## Click the video stream see the output


https://user-images.githubusercontent.com/76903243/205506017-9e112814-f444-4ab7-b12d-6401afa5bf7e.mp4



