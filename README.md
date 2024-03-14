### Music Recommendation Engine

This Java program implements a simple Music Recommendation Engine that recommends songs based on user preferences for different genres. It uses a map to store music genres as keys and lists of songs as values. The program provides a method to recommend music based on the user's specified genre.

### How it Works

1. **Initializing Music Library**: The `MusicRecommendationEngine` class initializes a `musicLibrary` map with sample data, where each genre is mapped to a list of songs.
2. **Recommendation Method**: The `recommendMusic(String genre)` method takes a genre as input and returns a randomly selected song from the corresponding genre's list of songs. If no songs are found for the given genre, it returns a message indicating no recommendations found.
3. **Example Usage**: In the `main` method, an instance of `MusicRecommendationEngine` is created. An example usage demonstrates how to recommend music based on a user's preference for a particular genre.

### Sample Output

```
Recommended song in the Rock genre: Song6

```

### Customization

- Extend the music library by adding more genres and songs to provide a wider range of recommendations.
- Integrate with external APIs or databases to fetch real-time music data for more accurate recommendations.
- Implement additional features such as user profiles, ratings, and personalized recommendations based on user history.

### Usage

Compile and run the program to test the music recommendation functionality. Update the `main` method to customize user inputs and preferences.

```bash
javac MusicRecommendationEngine.java
java MusicRecommendationEngine

```

### Dependencies

- Java Development Kit (JDK) version 8 or higher.

### Author

Jeel patel 

### Contact

pateljeel0950@gmail.com
