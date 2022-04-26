package keys.and.doors;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
	public UUID key = UUID.randomUUID();
	private KeyShape shape = KeyShape.Unknown;

	public Key() {
		key = UUID.randomUUID();
	}

	public Key(KeyShape shape) {
		this();
		this.shape = shape;
	}

	public Key(Key original) {
		key = original.key;
		shape = original.shape;
	}

	public KeyShape shape() {
		return shape;
	}

	@Override
	public Object clone() {
		return new Key(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (!getClass().isInstance(obj))
			return false;
		Key other = (Key) obj;
		return key.equals(other.key);
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

	@Override
	public int compareTo(Key o) {
		return key.compareTo(o.key);
	}

	@Override
	public String toString() {
		return key.toString(); // Not the same toString() as the method
	}

}
