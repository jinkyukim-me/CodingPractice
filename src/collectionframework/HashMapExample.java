package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        map.put("국어",85);
        map.put("영어",90);
        map.put("수학",88);
        map.put("과학",93);
        map.put("영어",100);
        System.out.println("총 entry 수: " + map.size());
        System.out.println(map);

        // 객체 찾기
        System.out.println("\t영어 : " + map.get("영어"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keyset = map.keySet(); // Key Set 얻기
        Iterator<String> keyInterator = keyset.iterator();
        while(keyInterator.hasNext()) {
            String key = keyInterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("영어");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println(map);
        System.out.println();

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
