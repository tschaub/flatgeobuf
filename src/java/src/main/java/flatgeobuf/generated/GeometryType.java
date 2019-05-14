package flatgeobuf.generated;

// automatically generated by the FlatBuffers compiler, do not modify

public final class GeometryType {
  private GeometryType() { }
  public static final byte Point = 0;
  public static final byte MultiPoint = 1;
  public static final byte LineString = 2;
  public static final byte MultiLineString = 3;
  public static final byte Polygon = 4;
  public static final byte MultiPolygon = 5;

  public static final String[] names = { "Point", "MultiPoint", "LineString", "MultiLineString", "Polygon", "MultiPolygon", };

  public static String name(int e) { return names[e]; }
}

