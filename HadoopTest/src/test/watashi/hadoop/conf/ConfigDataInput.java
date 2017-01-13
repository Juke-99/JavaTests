package test.watashi.hadoop.conf;

import java.io.DataInput;
import java.io.IOException;

public class ConfigDataInput implements DataInput{

	@Override
	public void readFully(byte[] b) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void readFully(byte[] b, int off, int len) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public int skipBytes(int n) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean readBoolean() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public byte readByte() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int readUnsignedByte() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public short readShort() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int readUnsignedShort() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public char readChar() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int readInt() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public long readLong() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public float readFloat() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public double readDouble() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public String readLine() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String readUTF() throws IOException {
		return "read";
	}

}
