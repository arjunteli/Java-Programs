package kn.interview;

public class ObjectClass implements Comparable<ObjectClass> {
	String key;
	Integer count;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public ObjectClass(String key, Integer count) {
		super();
		this.key = key;
		this.count = count;
	}

	@Override
	public String toString() {
		return "ObjectClass [key=" + key + ", count=" + count + "]";
	}

	@Override
	public int compareTo(ObjectClass o) {
		if (o.count > this.count) {
			return 1;
		} else if (o.count < this.count) {
			return -1;
		} else {
			return 0;
		}
	}
}
