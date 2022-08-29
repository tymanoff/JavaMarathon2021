package Ylab;

import org.jetbrains.annotations.NotNull;

public class AsciiCharSequence implements CharSequence{

    private byte[] arrByte;
    public AsciiCharSequence(byte[] arrByte) {
        this.arrByte = arrByte;
    }

    @Override
    public int length() {
        return arrByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char) (arrByte[index] & 0xff);
    }

    @NotNull
    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];
        for (int i = 0, j=start; i < length; i++,j++) {
            bytes[i] = arrByte[j];
        }
        return new AsciiCharSequence(bytes);
    }

    @Override
    public String toString() {
        return new String(arrByte);
    }
}
class a{
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
//        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
//        System.out.println(answer.toString());//Hello!
        example[0] = 74;
//        System.out.println(answer.toString());//Hello!
    }
}