package wordPackage;

import java.util.List;
import java.util.Objects;

public class Word {
	// 하나의 단어에 뜻이 여러개 저장될 수 있게 설계
	// 뜻에 띄어쓰기를 포함
	// 1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
	
	private String word;
	private List<String> mean;
	
	public Word() {
		
	}
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getMean() {
		return mean;
	}
	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	
	public void print() {
		System.out.println(word);
		int cnt = 0;
		for(String s : mean) {
			cnt++;
			System.out.println(cnt + ". " + s);
		}
	}
	
	
	
	
	
}
