import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MusicRecommendationEngine {

    // Map to store music genres and their corresponding songs
    private Map<String, List<String>> musicLibrary;

    public MusicRecommendationEngine() {
        // Initialize music library with sample data
        musicLibrary = new HashMap<>();
        musicLibrary.put("Pop", List.of("Song1", "Song2", "Song3"));
        musicLibrary.put("Rock", List.of("Song4", "Song5", "Song6"));
        musicLibrary.put("Jazz", List.of("Song7", "Song8", "Song9"));
        musicLibrary.put("Classical", List.of("Song10", "Song11", "Song12"));
        // Add more genres and songs as needed
    }

    // Method to recommend music based on the user's preferences
    public String recommendMusic(String genre) {
        List<String> songs = musicLibrary.get(genre);
        if (songs != null && !songs.isEmpty()) {
            // Generate a random index to select a song from the list
            int randomIndex = new Random().nextInt(songs.size());
            return songs.get(randomIndex);
        } else {
            return "No recommendations found for this genre";
        }
    }

    public static void main(String[] args) {
        MusicRecommendationEngine recommendationEngine = new MusicRecommendationEngine();
        // Example usage: recommend music based on user's preference
        String genre = "Rock";
        String recommendedSong = recommendationEngine.recommendMusic(genre);
        System.out.println("Recommended song in the " + genre + " genre: " + recommendedSong);
    }
}
