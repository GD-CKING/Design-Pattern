package com.adapter;

/**
 * 抽象成绩操作类：目标接口
 */
public interface ScoreOperation {

    int[] sort(int array[]);

    int search(int array[], int key);
}
