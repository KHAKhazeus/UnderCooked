package Iterator;

/*
    Name: Iterator
    Description:
    Iterator, as a design pattern, can be used in various scenarios and
    Java Collections have already supported Iterators. Accordingly,
    self-implemented collections and iterators is rather useless since
    they can be replaced by currently available classes. Nevertheless
    in this project, we plan to present it in its general form along with a
    man-made case to exemplify how to apply the self-designed class in spite
    of the high possibility of never using them.
    Notice:
    There are two types of implementation. One is based on inner-class structure
    and the other is clearly separated. Here we plan to implement both of them,
    deferring the decision to future development.
 */
public interface Iterator{
//    void setCollection(Collection target);
    public Boolean hasNext();
    public Iterator next();
}
