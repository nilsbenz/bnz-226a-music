package music;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicOrganizerTest {

    private MusicOrganizer organizer;

    @BeforeEach
    public void beforeEach() {
        organizer = new MusicOrganizer();
    }

    @Test
    public void addFileToArraylist() {
        String filename = "test.mp3";

        organizer.addFile(filename);

        assertEquals(1, organizer.getNumberOfFiles());
        assertEquals(0, organizer.findFirst(filename));
    }

    @Test
    public void findTrackIndex() {
        organizer.addFile("file1.mp3");
        organizer.addFile("file2.mp3");
        organizer.addFile("file3.mp3");

        assertEquals(2, organizer.findFirst("file3.mp3"));
    }

    @Test
    public void searchForTrack() {
        organizer.addFile("highhopes.mp3");
        organizer.addFile("brother.mp3");
        organizer.addFile("followyourfire.mp3");

        assertEquals("brother.mp3", organizer.listMatching("broth"));
        assertEquals("", organizer.listMatching("notContainedInList"));
        assertEquals("highhopes.mp3", organizer.listMatching("1"));
    }
}