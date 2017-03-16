package com.example.ojboba.passintentdemo;

/**
 * Created by OjBoba on 3/15/2017.
 */
        import android.os.Parcel;
        import android.os.Parcelable;
public class Book implements Parcelable {

    private String bookName;
    private String author;
    private int publishTime;

    public Book(String mBookName, String mAuthor,int mPublishTime){
        bookName = mBookName;
        author = mAuthor;
        publishTime = mPublishTime;
    }

    public Book(Parcel source) {
        bookName = source.readString();
        author = source.readString();
        publishTime = source.readInt();
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPublishTime() {
        return publishTime;
    }
    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public static final Parcelable.Creator<Book> CREATOR = new Creator<Book>() {
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(bookName);
        parcel.writeString(author);
        parcel.writeInt(publishTime);
    }

}