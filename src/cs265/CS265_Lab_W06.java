package cs265;

public class CS265_Lab_W06 {
	
	/** Defines the visual property of the sky */
	enum Sky {Cloudy, Mixed, Clear};
	
	/** Defines the various categories of weather prediction, including an error */
	enum WeatherPrediction {Rainy, Sunny, Error};
	
	/** The method is part of a Weather Prediction Service to reliably predict Irish weather. 
	 * The specification states the following:
	 * 
	 * The temperature is expressed in Celsius and simplified to full degrees (e.g. 10 for 10 degrees 
	 * Celsius, or -5 for minus 5 degrees Celsius). 
	 * The sky parameter is obtained from another service that interprets the looks of the sky 
	 * (either by an AI using a webcam-based image, or by a low-payed employee looking out of the 
	 * window all day and regularly pressing a button).
	 * Temperatures under -15 degrees are not possible and result in an Error weather prediction.
	 * If the sky is Cloudy or Mixed, the prediction is always Rainy
	 * If the temperature is less than +15 degrees, the prediction is Rainy.
	 * If the Sky is Clear and the temperature is +15 degrees or more, the prediction is Sunny. 
	 * 
	 * @param temperature The temperature in degrees Celsius
	 * @param sky The visual property of the sky
	 * @return The prediction of the weather
	 */
	public static WeatherPrediction predictWeather(int temperature, Sky sky){
		if(temperature <= -15) {
			return WeatherPrediction.Error;
		}
		if(sky == Sky.Cloudy || sky == Sky.Mixed) {
			return WeatherPrediction.Rainy;
		}
		if(temperature < 15) {
			return WeatherPrediction.Rainy;
		}
		if(sky == Sky.Clear) {
			if(temperature >= 15) {
				return WeatherPrediction.Sunny;
			}
		}
		if(temperature >= -14 && temperature <= -14) {
			
		}
		return WeatherPrediction.Rainy; // works well for Ireland!
	}
	
	public static void main(String[] args) {
		System.out.println(CS265_Lab_W06.predictWeather(-100, Sky.Cloudy));
	}
	
	
}