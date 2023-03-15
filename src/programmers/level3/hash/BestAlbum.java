package programmers.level3.hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, HashMap<Integer, Integer>> genresMap = new HashMap<>();
        HashMap<String, Integer> playMap = new HashMap<>();
        ArrayList<Integer> resultAL = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            HashMap<Integer, Integer> infoMap = genresMap.getOrDefault(key, new HashMap<Integer, Integer>());

            infoMap.put(i, plays[i]);
            genresMap.put(key, infoMap);

            int totalPlay = playMap.getOrDefault(key, 0);
            totalPlay += plays[i];
            playMap.put(key, totalPlay);
        }

        List<Map.Entry<String, Integer>> playList = new ArrayList<>(playMap.entrySet());

        Collections.sort(playList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int value = o2.getValue().compareTo(o1.getValue());
                return value;
            }
        });

        for (Map.Entry<String, Integer> playEntry : playList) {
            HashMap<Integer, Integer> songMap = genresMap.get(playEntry.getKey());

            List<Map.Entry<Integer, Integer>> songList = new ArrayList<>(songMap.entrySet());
            Collections.sort(songList, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    int cmp = o2.getValue().compareTo(o1.getValue());
                    return cmp;
                }
            });

            int count = 0;

            for (Map.Entry<Integer, Integer> songEntry : songList) {
                resultAL.add(songEntry.getKey());
                count++;
                if (count >= 2) {
                    break;
                }
            }
        }

        int[] answer = new int[resultAL.size()];
        for (int i = 0; i < resultAL.size(); i++) {
            answer[i] = resultAL.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        BestAlbum bestAlbum = new BestAlbum();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//        String[] genres = {"pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] solution = bestAlbum.solution(genres, plays);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }
}
