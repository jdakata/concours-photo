package dao.sql;

import dao.PostDao;
import model.Label;
import model.Post;
import model.Theme;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SqlPostDao extends SqlDao<Post> implements PostDao {

    @Override
    protected Post createObjectFromResult(ResultSet resultSet) throws SQLException {
        int authorId = resultSet.getInt("author");
        User author = new SqlUserDao().getById(authorId);

        int themeId = resultSet.getInt("theme");
        Theme theme = new SqlThemeDao().getById(themeId);

        return new Post(
                resultSet.getInt("id"),
                resultSet.getString("title"),
                resultSet.getString("reacted"),
                null,
                author,
                new Label(resultSet.getString("label")),
                theme,
                resultSet.getString("photo_url")
        );
    }

    @Override
    public Post insert(Post post) {
        return null;
    }

    @Override
    public List<Post> getAllByTheme(int themeId) {
        return null;
    }

    @Override
    public Post getById(int integer) {
        return null;
    }
}