package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    private String id;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }

    public MemberOnlyHash(String id) {
        this.id = id;
    }
}
