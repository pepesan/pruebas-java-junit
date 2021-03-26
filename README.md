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

# Launching tests
<code> mvn test</code>


