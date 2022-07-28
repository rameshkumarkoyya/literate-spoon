package com.lru.cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

	Deque<Integer> cache;
	HashSet<Integer> cacheKeyRef;
	private final int CACHE_LIMIT_SIZE;

	LRUCache(int capacity) {
		cache = new LinkedList<Integer>();
		cacheKeyRef = new HashSet<Integer>();
		CACHE_LIMIT_SIZE = capacity;

	}

	public static void main(String args[]) {
		 LRUCache cache = new LRUCache(3);
	        cache.refer(1);
	        cache.refer(2);
	        cache.refer(3);
	        cache.refer(1);
	        cache.refer(4);
	        cache.refer(5);
	        cache.display();
	}

	public void refer(int page) {

		if (!cacheKeyRef.contains(page)) {
			if (cache.size() == CACHE_LIMIT_SIZE) {
				int lastElement = cache.removeLast();
				cacheKeyRef.remove(lastElement);
			}
		} else {
			cache.remove(page);
		}
		cache.push(page);
		cacheKeyRef.add(page);
	}

	public void display() {
		Iterator<Integer> itr = cache.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
