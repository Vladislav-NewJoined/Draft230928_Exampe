// источник: https://youtu.be/tpv5n2jWHlw

public class Class18_iz_video_pro_IDE_Intellij_Idea {

// Из видео про Intellij idea:
// - Убрать Тулбар
// - Отключить Навигейшн бар
// - Отключить слева вертикальную полоску
// - Ctrl + Shift + Enter, чтобы написать psvm
// - psvm далее Tab
// - Bure -> вызвать комплишн Ctrl + Shift + Space и появится BufferedReader
// - после BufferedReader написать r вызвать комплишн Ctrl + Shift + Space и закомплитить подходящее название, напр reader
// - после BufferedReader reader можно Ctrl + Shift, т.е. вызвать быстрый комплишн Ctrl + Shift + Space
// (или Ctrl + Space) или смарт комплишн completion
// - Можно нажать Ctrl + Shift + Пробел - два раза - и будет искать то, чего нет.
// - Там, где new тоже подсказывает, нажать Enter
// - 20 57 Генерация элементов класса
// - Ctrl + ЛКМ   или   Ctrl + Alt + ЛКМ  - подносить к разным элементам

}

/*public */class SorterTest {
    public void test() throws Exception {
//        String[] actual = Sorter.loadAndSort(new StringReader("b\na\nc"));
        String[] expected = {"a", "b", "c"};
//        assertArrayEquals(expected, actual);
        Person person = new Person("Bob");
    }
}

//class Sorter {
//    public static String[] loadAndSort(StringReader stringReader) {
//        return StringReader stringReader;
//    }
//}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
