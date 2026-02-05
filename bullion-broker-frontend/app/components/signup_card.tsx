export default function SignupCard() {
  return (
    <section className="w-full md:w-2/5 flex items-center justify-center px-6">
      <div className="w-full max-w-md bg-slate-900/90 backdrop-blur border border-slate-800 rounded-xl p-8 shadow-2xl">
        <h2 className="text-2xl font-semibold mb-6 text-center">
          Register user
        </h2>

        <form className="space-y-4">
          <div>
            <label className="block text-sm mb-1 text-slate-400">
              Pan Number
            </label>
            <input
              type="text"
              placeholder="Enter pan number"
              className="w-full px-4 py-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
            />
          </div>

          <div>
            <label className="block text-sm mb-1 text-slate-400">
              Phone Number
            </label>
            <input
              type="tel"
              inputMode="numeric"
              pattern="[0-9]*"
              placeholder="Enter phone number"
              className="w-full px-4 py-2 mb-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
            />
          </div>

          <div>
            <label className="block text-sm mb-1 text-slate-400">OTP</label>
            <input
              type="text"
              inputMode="numeric"
              pattern="[0-9]*"
              placeholder="Enter OTP"
              className="w-full px-4 py-2 mb-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
            />
          </div>

          <div>
            <label className="block text-sm mb-1 text-slate-400">
              User Type
            </label>
            <select
              defaultValue=""
              className="w-full
      px-4
      py-2
      pr-10
      mb-2
      rounded-md
      bg-slate-950
      border
      border-slate-800
      text-slate-200
      focus:outline-none
      focus:ring-2
      focus:ring-amber-400
      appearance-none"
            >
              <option value="" disabled className="text-slate-500">
                Select user type
              </option>
              <option value="broker">Broker</option>
              <option value="trader">Trader</option>
            </select>
          </div>

          <div>
            <button
              type="button"
              className="w-full bg-amber-400 text-slate-950 font-semibold py-2 rounded-md hover:bg-amber-300 transition"
            >
              Register
            </button>
          </div>
        </form>

        {/* Divider */}
        <div className="flex items-center my-6">
          <div className="grow border-t border-slate-800" />
          <span className="px-3 text-sm text-slate-500">or</span>
          <div className="grow border-t border-slate-800" />
        </div>

        {/* Signup option */}
        <p className="text-sm text-center text-slate-400">
          Already user?{" "}
          <button
            type="button"
            className="text-amber-400 hover:underline font-medium"
          >
            Sign up
          </button>
        </p>

        <p className="text-xs text-slate-500 text-center mt-6">
          By continuing, you agree to our Terms & Privacy Policy
        </p>
      </div>
    </section>
  );
}
