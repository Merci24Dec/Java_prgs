//11. Write a Java Program to demonstrate an explicit wait condition check.
WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
element2.click();
