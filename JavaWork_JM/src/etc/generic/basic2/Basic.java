package etc.generic.basic2;

//멀티 제네릭 ( key,value)
public class Basic<K,V> {
	
	private K key;
	private V value;
	public Basic(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public V get(K Key) {
		return this.value;
	}
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "{" + key + " = " + value + "}";
	}
	
	
}
