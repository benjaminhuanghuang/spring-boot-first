使用Hibernate的情况下，由于依赖JAXB，这个时候可能会碰到这个错误：java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException，
需要引入如下依赖：
```
    <dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.0</version>
    </dependency>
```