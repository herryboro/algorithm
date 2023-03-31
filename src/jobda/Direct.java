package jobda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Direct {
    private String currentPath;
    private Map<String, List<String>> fileSystem;

    public Direct(String[] dir) {
        currentPath = dir[0];
        fileSystem = new HashMap<>();

        for(int i = 1; i < dir.length; i++) {
            String path = dir[i];
            String[] componets = path.split("/");
            String parentPath = "";
            for(int j = 0; j < componets.length -1; j++) {
                String folderName = componets[j];
                String folderPath = parentPath + folderName + "/";
                if(!fileSystem.containsKey(folderPath)) {
                    fileSystem.put(folderPath, new ArrayList<>());
                }
                parentPath = folderPath;
            }

            String fileName = componets[componets.length - 1];

            if(fileName.contains(".")) {
                fileSystem.get(parentPath).add(fileName);
            } else {
                String folderPath = path + "/";

                if(fileSystem.containsKey(folderPath)) {
                    fileSystem.put(folderPath, new ArrayList<>());
                }
            }
        }
    }

    public String solution(String[] Dir, String[][] Cmd) {
        Direct sol = new Direct(Dir);

        for(String[] cmd : Cmd) {
            if(cmd[1].startsWith("/")) {
                currentPath = cmd[1];
            } else {
                currentPath += "/" + cmd[1];
            }
        }
        return this.currentPath;
    }

    public static void main(String[] args) {
        String[] Dir = {"C:/root","C:/root/folder1","C:/root/folder2/file1.txt","C:/root/folder2/file2.txt"};
        String[][] Cmd = {{"CD","folder3"}};
        Direct manager = new Direct(Dir);
        String result = manager.solution(Dir, Cmd);
        System.out.println(result); // should print "C:/root/folder1"
    }
}
