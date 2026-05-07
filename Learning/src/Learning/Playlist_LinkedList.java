package Learning;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        int option = 0;

        while (option != 6) {

            System.out.println();
            System.out.println("1 - Add song");
            System.out.println("2 - Remove song by name");
            System.out.println("3 - Play first song");
            System.out.println("4 - Show playlist");
            System.out.println("5 - Move first song to the end");
            System.out.println("6 - EXIT");
            System.out.print("Choose an option: ");
            option=scanner.nextInt();
            scanner.nextLine();
            
            if (option == 1) {
            	System.out.print("Enter a song name: ");
            	String songName = scanner.nextLine();
            	if (playlist.contains(songName)) {
            		System.out.println("This song already exists in the playlist");
            	}else {
            	playlist.add(songName);
            	}
            }else if(option == 2){
            	System.out.print("Enter a song to remove: ");
            	String removeSong = scanner.nextLine();
            	if (playlist.isEmpty()) {
            	    System.out.println("No songs added to the playlist");
            	} else if (playlist.contains(removeSong)) {
            	    playlist.remove(removeSong);
            	    System.out.println("You removed: " + removeSong);
            	} else {
            	    System.out.println("Song not found");
            	}
            
            }else if(option == 3) {
            	if(playlist.isEmpty()) {
            		System.out.println("playlist is empty");
            	}else {
            		System.out.println("Song 1: "+playlist.getFirst() +" is playing");
            		playlist.removeFirst();
            	}
            }else if(option == 4) {
            	if(playlist.isEmpty()) {
            		System.out.println("No playlist found");
            	}else {
            	for (String songs : playlist) {
            		System.out.println(songs);
            		}
            	}
            	
            }else if(option==5){
            	if (playlist.isEmpty()) {
            		System.out.println("playlist is empty");
            	} else {
            		String firstSong = playlist.getFirst();
            		playlist.addLast(firstSong);
            		playlist.removeFirst();
            		System.out.println("you moved "+firstSong +" to the end");}
            	} else if(option ==6){
            		System.out.println("EXITING SYSTEM...");
            	}else {
            		System.out.println("Invalid");
            	}
            }
            
        }
    }