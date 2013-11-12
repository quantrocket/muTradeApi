/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class TradeBook {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TradeBook(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeBook obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ContextModeuleJNI.delete_TradeBook(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_std__listT_mutrade__Trade_p_t getTrades(long clOrderId) {
    long cPtr = ContextModeuleJNI.TradeBook_getTrades(swigCPtr, this, clOrderId);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_mutrade__Trade_p_t(cPtr, false);
  }

  public int update(ExecutionReport report) {
    return ContextModeuleJNI.TradeBook_update(swigCPtr, this, ExecutionReport.getCPtr(report), report);
  }

  public TradeBook() {
    this(ContextModeuleJNI.new_TradeBook(), true);
  }

}