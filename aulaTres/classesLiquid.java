import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class SocialNetwork {
    private List<User> users;

    public SocialNetwork() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void showAllPosts() {
        for (User user : users) {
            for (Post post : user.getPosts()) {
                System.out.println(user.getUsername() + ": " + post.getContent());
            }
        }
    }
}

public class User {
    private String id;
    private String name;
    private String email;
    private Date birthDate;
    private String password;
    private String bio;
    private List<User> followers;
    private List<User> following;
    private List<Post> posts;
    private Boolean professional;

    public User(String id, String nome, String email, Date birthDate, String password, Boolean professional){
        this.id = UUID.randomUUID().toString(); //gera um id
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
        this.bio = '';
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.professional = professional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<Post> getPosts() {
        return posts;
    }

    //

    public void follow(User user) {
        if (!following.contains(user)) {
            following.add(user);
            user.getFollowers().add(this);
        }
    }

    public void unfollow(User user) {
        if (following.contains(user)) {
            following.remove(user);
            user.getFollowers().remove(this);
        }
    }

    public void addPost(Post post) {
        posts.add(post);
    }
    
}

public class Post {
    private String id;
    private String author;
    private String content;
    private Date timestamp;
    private String image;
    private String title;
    private String ingredients;
    private String recipe;
    private List<Like> likes;
    private List<Comments> comments;

    public Post(User author, String content, String title, String image, String recipe){
        this.id = UUID.randomUUID().toString();
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.title = title;
        this.image = image;
        this.recipe = recipe;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<Like> getLikes() {
        return likes;
    }

    //

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addLike(Like like) {
        likes.add(like);
    }

    
}

public class Recipe {
    private String title;
    private String contentOne;
    private String contentTwo;
    private String contentThree;
    private String picMain;
    private String picOne;
    private String picTwo;
    private String picThree;

    public Recipe(String title, String contentOne, String contentTwo, String contentThree, String picMain, String picOne, String picTwo, String picThree) {
        this.title = title;
        this.contentOne = contentOne;
        this.contentTwo = contentTwo;
        this.contentThree = contentThree;
        this.picMain = picMain;
        this.picOne = picOne;
        this.picTwo = picTwo;
        this.picThree = picThree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentOne() {
        return contentOne;
    }

    public void setContentOne(String contentOne) {
        this.contentOne = contentOne;
    }

    public String getContentTwo() {
        return contentTwo;
    }

    public void setContentTwo(String contentTwo) {
        this.contentTwo = contentTwo;
    }

    public String getContentThree() {
        return contentThree;
    }

    public void setContentThree(String contentThree) {
        this.contentThree = contentThree;
    }

    public String getPicMain() {
        return picMain;
    }

    public void setPicMain(String picMain) {
        this.picMain = picMain;
    }

    public String getPicOne() {
        return picOne;
    }

    public void setPicOne(String picOne) {
        this.picOne = picOne;
    }

    public String getPicTwo() {
        return picTwo;
    }

    public void setPicTwo(String picTwo) {
        this.picTwo = picTwo;
    }

    public String getPicThree() {
        return picThree;
    }

    public void setPicThree(String picThree) {
        this.picThree = picThree;
    }
}

public class BarRecipe {
    private String id;
    private String image;
    private String title;
    private String content;
    private List<Ingredients> ingredients;
    private String recipe;
    private List<Like> likes;

    public BarRecipe(String id, String image, String title, String content, List<Ingredient> ingredients, String recipe) {
        this.id = UUID.randomUUID().toString();
        this.image = image;
        this.title = title;
        this.content = content;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.likes = new ArrayList<>();
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<Like> getLikes() {
        return likes;
    }

    //

    public void addLike(Like like) {
        this.likes.add(like);
    }

}

public class Comment {
    private User author;
    private String content;
    private Date timestamp;

    public Comment(User author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}

public class Like {
    private User user;

    public Like(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}