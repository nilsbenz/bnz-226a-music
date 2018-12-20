package music;

public class Starter {

    public static void main(String[] args) {

        MusicOrganizer organizer = new MusicOrganizer();
        InputReader reader = new InputReader();

        organizer.addFile("raging.mp3");
        organizer.addFile("followyourfire.mp3");
        organizer.addFile("hattori.mp3");

        boolean terminate = false;

        System.out.println("Herzlich willkommen im Spotify der Zukunft!");

        while(!terminate) {
            switch(reader.getInput()) {
                case 1:
                    String filename = reader.getFilename(organizer);
                    organizer.addFile(filename);
                    break;
                case 2:
                    filename = organizer.listMatching(reader.getFilename(organizer));
                    int index = organizer.findFirst(filename);
                    if (index != -1) {
                        organizer.startPlaying(index);
                        System.out.println(filename + " wird abgespielt.");
                    } else {
                        System.out.println("Dieses File kann nicht abgespielt werden.");
                    }
                    break;
                case 3:
                    organizer.playSamples();
                    break;
                case 4:
                    organizer.playRandom();
                    break;
                case 5:
                    organizer.stopPlaying();
                    break;
                case 6:
                    organizer.stopPlaying();
                    terminate = true;
            }
        }

        //TODO: how can we start playing the main.java.music?
    }

} 
