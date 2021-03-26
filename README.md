# Installation ChromeDriver
* Check your Chrome Version in Help-> Google Chrome information
* Download the appropiated version of [ChromeDriver](https://chromedriver.chromium.org/downloads)
* unzip the file
* sudo mv /path/unzipped/chromedriver /usr/bin/
* sudo chown root:root /usr/bin/chromedriver
* sudo chmod +x /usr/bin/chromedriver
# Installation FirefoxDriver
* Check your Firefox Version in Help-> About Firefox
* Download the appropiated version of [FirefoxDriver](https://github.com/mozilla/geckodriver/releases)
* unzip the file
* sudo mv /path/unzipped/geckoriver /usr/bin/
* sudo chown root:root /usr/bin/geckodriver
* sudo chmod +x /usr/bin/geckodriver

# Installation PhantomJS
* Download the appropiated version of [PhantomJS](https://phantomjs.org/download.html)
* unzip the file
* sudo ln -sf /path/to/phantomjs /usr/bin


# Launching tests
<code> mvn test</code>

# Installing v3 Grid + Node
* Download the appropiated version of [Selenium Grid](https://www.selenium.dev/downloads/)
* Launching Hub: java -jar selenium-server-standalone-3.141.59.jar -role hub
* Launching Node: java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444
* Access [Grid console](http://172.19.0.1:4444/grid/console)
# Installing v4 Grid + Node
* Download the appropiated version of [Selenium Grid](https://www.selenium.dev/downloads/)
* Launching Hub: java -jar selenium-server-4.0.0-beta-2.jar hub
* Launching Node: java -jar selenium-server-4.0.0-beta-2.jar node
* Access [Grid console](http://172.19.0.1:4444/ui/index.html#/)


