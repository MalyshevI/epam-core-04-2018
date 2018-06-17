package com.epam.homework.task25;

import java.util.ArrayDeque;
import java.util.Deque;


public class Task25Impl implements Task25 {
    /**
     * Проверяет правильность расстановки скобок.
     * Правильная расстановка:
     * 1) Каждой открывающей скобке соответствует закрывающая того же типа.
     * 2) Нет пересечения областей, обрамленных скобками.
     *
     * @param string Анализируемая строка.
     * @return true - скобки расставлены верно, иначе - false.
     */
    @Override
    public boolean isNormalBrackets(String string) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch: string.toCharArray()){
            if (ch == '{' || ch == '[' || ch == '('){
                deque.add(ch);
                continue;
            }
            if (!deque.isEmpty()){
                if (deque.getLast() == ch){
                    deque.removeLast();
                }
            }
        }
        return deque.isEmpty();
    }
}
