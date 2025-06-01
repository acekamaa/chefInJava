package fileHandling.delete;
import java.io.File;

// for deleting a folder, the folder must be empty
public class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\User\\Documents\\MyFolder");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder. It may not be empty or does not exist.");
        }
    }
}
