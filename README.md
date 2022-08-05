# crescendo_assessment
# Getting Started
## Yelp Reviews Skills Assessment
This challenge allows you to show us your technical skills, how well you can put together a project from scratch and what you think about as you create your solution. Here is what we want you to do:

Choose your favorite local restaurant on Yelp that has a considerable amount of reviews. Here is an example. Build an API endpoint in your preferred language and framework (e.g., Spring Boot) that can take a parameter that you’ll use to retrieve the Yelp data. In the API endpoint, process the Yelp data, pull out the reviews, convert the review data into a list and output the information as JSON. Processing could be by Yelp API. Your JSON should include the reviewer’s relevant info and review content. Extra credit: For each review, take the reviewer avatar image and run it through the Google Vision API. What we are looking for is the emotions data such as joyLikelihood or sorrowLikelihood. Include this data along with the JSON data. If you are familiar with a similar technology feel free to use that instead of the Google Vision API.

## Execution
./gradlew clean bootRun

## TEST
./gradlew clean test

## Endpoints
* [FirstBusiness (http://localhost:9090/crescendo/first_business")](http://localhost:9090/crescendo/first_business")
* [Reviews  (http://localhost:9090/crescendo/sZtL9wpVfP7K5sERd1gPbA/reviews)](http://localhost:9090/crescendo/sZtL9wpVfP7K5sERd1gPbA/reviews)
* ID Business Selected : sZtL9wpVfP7K5sERd1gPbA
 
## TO DO :
Need To Complete Google Vision Functionality

## Other Importants Links
* [Yelp Search Business](https://www.yelp.com/developers/documentation/v3/business_search)
* [Yelp Reviews](https://www.yelp.com/developers/documentation/v3/business_reviews)
* [Google Vision Integration.](https://cloud.google.com/vision/docs/detecting-faces?apix_params=%7B%22resource%22%3A%7B%22requests%22%3A%5B%7B%22features%22%3A%5B%7B%22maxResults%22%3A10%2C%22type%22%3A%22FACE_DETECTION%22%7D%5D%2C%22image%22%3A%7B%22source%22%3A%7B%22imageUri%22%3A%22gs%3A%2F%2Fcloud-samples-data%2Fvision%2Fface%2Ffaces.jpeg%22%7D%7D%7D%5D%7D%7D)
