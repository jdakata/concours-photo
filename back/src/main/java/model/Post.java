package model;

import java.util.List;
import java.util.Map;

public class Post {
    public final Integer id;
    public final String date;
    public final String title;
    public final String reacted;
    public final List<Reactions> reactions;
    public final Map<String, List<UserPublic>> reactionsUser;
    public final User author;
    public final Label label;
    public final Theme theme;
    public final Integer score;
    public final Integer nbVote;
    public final Integer nbComment;
    public final String photo;
    public final String photoDelete;

    public Post() {
        this(null, null, null, null, null, null, null, null);
    }

    public Post(String title, String date, String reacted, List<Reactions> reactions, Map<String, List<UserPublic>> reactionsUser,
                User author, Label label, Theme theme, String photo, String photoDelete,
                Integer score, Integer nbVote, Integer nbComment, Integer id) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.reacted = reacted;
        this.reactions = reactions;
        this.reactionsUser = reactionsUser;
        this.author = author;
        this.label = label;
        this.theme = theme;
        this.photo = photo;
        this.photoDelete = photoDelete;
        this.score = score;
        this.nbComment = nbComment;
        this.nbVote = nbVote;
    }

    public Post(String title, String reacted, List<Reactions> reactions, User author, Label label, Theme theme, String photo, String photoDelete) {
        this(title, null, reacted, reactions, null, author, label, theme, photo, photoDelete, 0, 0, 0, null);
    }

    @Override
    public String toString() {
        return "Post(id: " + this.id +
                ", date: " + this.date +
                ", title: " + this.title +
                ", reacted: " + this.reacted +
                ", reactions: " + this.reactions +
                ", author: " + this.author +
                ", label: " + this.label +
                ", theme: " + this.theme +
                ", score: " + this.score +
                ", nbComment: " + this.nbComment +
                ", nbVote: " + this.nbVote +
                ", photo: " + this.photo +
                ", photoDelete: " + this.photoDelete + ")";
    }
}
